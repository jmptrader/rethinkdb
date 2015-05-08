// Autogenerated by convert_protofile.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Insert extends RqlQuery {


    public Insert(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Insert(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Insert(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INSERT, args, optargs);
    }
    protected Insert(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Insert fromArgs(Object... args){
        return new Insert(new Arguments(args), null);
    }


}
