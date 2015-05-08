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



public class GetAll extends RqlQuery {


    public GetAll(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public GetAll(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public GetAll(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.GET_ALL, args, optargs);
    }
    protected GetAll(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static GetAll fromArgs(Object... args){
        return new GetAll(new Arguments(args), null);
    }


}
