package com.blasedef.onpa.ONPA.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.runner.RunWith;
import com.google.inject.Inject;
import com.blasedef.onpa.ONPAInjectorProvider;
import com.blasedef.onpa.oNPA.Rate;
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.blasedef.onpa.oNPA.Model
import org.junit.Test
import org.junit.Assert
import com.blasedef.onpa.oNPA.Expression
import com.blasedef.onpa.oNPA.Sub
import com.blasedef.onpa.oNPA.Plu
import com.blasedef.onpa.oNPA.Mul
import com.blasedef.onpa.oNPA.Div
import com.blasedef.onpa.oNPA.Constant

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ONPAInjectorProvider))
public class ModelParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	CharSequence output
	
	Rate intermediateRate
	
	Model intermediateModel
	
	@Test def void testVariableExpression1() {
	'''i = 10;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpression2() {
	'''i = 10.0;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpression3() {
	'''i = 0.1;'''.parse.assertNoErrors
	}

	@Test def void testVariableExpressionSub1() {
	'''i = 0.2 - 0.1;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionPlu1() {
	'''i = 0.2 + 0.1;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionMul1() {
	'''i = 0.2 * 0.1;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionDiv1() {
	'''i = 0.2 / 0.1;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionRat1() {
	'''i = 0.2 / 0.1;
	   j = 0.2;
	   k = i + j;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionExp1() {
	'''i = (0.2 / 0.1) + 0.4;'''.parse.assertNoErrors
	}
	
	@Test def void testVariableExpressionExp2() {
	'''i = 0.2 / 0.1;
	   j = 0.2;
	   k = (0.1 + i) + j;'''.parse.assertNoErrors
	}

	@Test
	def void testSimple() {
		assertRepr("i = 10.0;","10.0")
	}
	
	@Test
	def void testSimple1() {
		assertRepr("i = (10.0);","10.0")
	}
	
	@Test
	def void testSimplePlus() {
		assertRepr("i = (10.0 + 1.0);","(10.0 + 1.0)")
	}
	
	@Test
	def void testSimplePlus1() {
		assertRepr("i = 10.0 + 1.0;","(10.0 + 1.0)")
	}
	
	@Test
	def void testPlus1() {
		assertRepr("i = (10.0 + 1.0) + 3.0;","((10.0 + 1.0) + 3.0)")
	}
	
	@Test
	def void testMix1() {
		assertRepr("i = ((10.0+1.0)/2.0)+((3.0+1.0)/2.0);","(((10.0 + 1.0) / 2.0) + ((3.0 + 1.0) / 2.0))")
	}
	
	def assertRepr(CharSequence input, CharSequence expectation) {
		
		intermediateModel = input.parse
		intermediateRate = intermediateModel.rates.last
		output = intermediateRate.value.stringRepr
		//println(output)
		//println(expectation)
		Assert::assertEquals(output,expectation)
		
	}
	
	def CharSequence stringRepr(Expression e) {
		switch (e) {
			Sub: '''(«e.left.stringRepr» - «e.right.stringRepr»)'''
			Plu: '''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			Mul: '''(«e.left.stringRepr» * «e.right.stringRepr»)'''
			Div: '''(«e.left.stringRepr» / «e.right.stringRepr»)'''
			Rate: '''(«e.rate.name»)'''
			Constant: '''«e.value»'''
			}.toString
	}

	
}