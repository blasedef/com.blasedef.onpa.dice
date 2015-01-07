/*
 * generated by Xtext
 */
package com.blasedef.onpa.validation


import org.eclipse.xtext.validation.Check
import com.blasedef.onpa.oNPA.Expression
import com.blasedef.onpa.oNPA.Sub
import com.blasedef.onpa.oNPA.Plu
import com.blasedef.onpa.oNPA.Mul
import com.blasedef.onpa.oNPA.Div
import java.util.ArrayList
import java.util.Set
import java.util.HashSet
import com.blasedef.onpa.oNPA.ONPAPackage
import com.blasedef.onpa.oNPA.Or
import com.blasedef.onpa.oNPA.And
import com.blasedef.onpa.oNPA.Equality
import com.blasedef.onpa.oNPA.Comparison
import com.blasedef.onpa.oNPA.Not
import com.blasedef.onpa.oNPA.ReferencedRate
import com.blasedef.onpa.oNPA.DoubleConstant
import com.blasedef.onpa.oNPA.BoolConstant
import com.blasedef.onpa.oNPA.Store
import com.blasedef.onpa.oNPA.AttributeValue

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ONPAValidator extends AbstractONPAValidator {
	
	
	public static val SELF_REFERENCING_RATE = 'selfReferencingRate'
	
	@Check
	def checkNotSelfReferencing(Store store){
			
		var ArrayList<String> strings = new ArrayList<String>();
		
		strings.add((store as AttributeValue).name)
		
		findReferencedRates((store as AttributeValue).value,strings)
		
		var Set<String> setOfString = new HashSet<String>(strings);
		
		if(setOfString.size == strings.size)
			return //because there can't be any duplicates
		else
			error("Cannot have self referencing rates. '" + (store as AttributeValue).name + "' is seen in the expression",
				ONPAPackage::eINSTANCE.attributeValue_Value,
				SELF_REFERENCING_RATE
			)
		
	}
	
	def void findReferencedRates(Expression e, ArrayList<String> strings) {
		switch (e) {
			Or: 			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			And: 			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Equality:   	{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Comparison: 	{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Sub: 			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Plu: 			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Mul:			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Div: 			{e.left.findReferencedRates(strings) e.right.findReferencedRates(strings)}
			Not: 			e.expression.findReferencedRates(strings)
			ReferencedRate: {strings.add(e.value.name)}
			}
	}

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
