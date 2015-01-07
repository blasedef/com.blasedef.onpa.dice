/**
 * generated by Xtext
 */
package com.blasedef.onpa.generator;

import com.blasedef.onpa.oNPA.And;
import com.blasedef.onpa.oNPA.AttributeValue;
import com.blasedef.onpa.oNPA.BoolConstant;
import com.blasedef.onpa.oNPA.Comparison;
import com.blasedef.onpa.oNPA.Div;
import com.blasedef.onpa.oNPA.DoubleConstant;
import com.blasedef.onpa.oNPA.Equality;
import com.blasedef.onpa.oNPA.Expression;
import com.blasedef.onpa.oNPA.Model;
import com.blasedef.onpa.oNPA.Mul;
import com.blasedef.onpa.oNPA.Not;
import com.blasedef.onpa.oNPA.Or;
import com.blasedef.onpa.oNPA.Plu;
import com.blasedef.onpa.oNPA.ReferencedRate;
import com.blasedef.onpa.oNPA.Store;
import com.blasedef.onpa.oNPA.Sub;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class ONPAGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Model> _filter = Iterables.<Model>filter(_iterable, Model.class);
    for (final Model e : _filter) {
      CharSequence _compile = this.compile(e);
      fsa.generateFile("simulators/simulator.java", _compile);
    }
  }
  
  public CharSequence compile(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package simulators;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class simulator{");
    _builder.newLine();
    {
      EList<Store> _stores = model.getStores();
      for(final Store store : _stores) {
        _builder.append("\t");
        CharSequence _compile = this.compile(((AttributeValue) store));
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final AttributeValue store) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public double get");
    String _name = store.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    Expression _value = store.getValue();
    CharSequence _compile = this.compile(_value);
    _builder.append(_compile, "\t");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Or)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" || ");
        Expression _right = ((Or)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((And)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" && ");
        Expression _right = ((And)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Equality)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" ");
        String _op = ((Equality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Equality)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Comparison)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" ");
        String _op = ((Comparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Comparison)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Sub)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" - ");
        Expression _right = ((Sub)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Plu) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Plu)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" + ");
        Expression _right = ((Plu)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Mul)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" * ");
        Expression _right = ((Mul)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Div)e).getLeft();
        CharSequence _compile = this.compile(_left);
        _builder.append(_compile, "");
        _builder.append(" / ");
        Expression _right = ((Div)e).getRight();
        CharSequence _compile_1 = this.compile(_right);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("! ");
        Expression _expression = ((Not)e).getExpression();
        CharSequence _compile = this.compile(_expression);
        _builder.append(_compile, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ReferencedRate) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("get");
        AttributeValue _value = ((ReferencedRate)e).getValue();
        String _name = _value.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof DoubleConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        double _value = ((DoubleConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult.toString();
  }
}
