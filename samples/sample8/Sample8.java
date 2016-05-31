import jp.ne.sakura.uhideyuki.brt.brtsyn.*;
import jp.ne.sakura.uhideyuki.brt.runtime.*;

/** Sample8 -- A sample of STG evaludation, corresponding to:

  main = let
    s = "Hello, Let Expression!"
    e = putStrLn s
   in e

 This sample shows that FVar should be AtomExpr.

 */
public class Sample8 {
    public static void main(String[] args){
	String[] ns = {"Main.l1.s", "Main.l1.e"};
	Expr s = RTLib.fromJString("Hello, FVar should be AtomExpr!"); 
	Expr e = RTLib.app(RTLib.putStrLn, new AtomExpr(new FVar("Main.l1.s")));
	Expr[] es = {s, e};
	Expr expr = new LetExpr(ns, es, Codes.body);
	RT.eval(expr);
    }
}

class Codes {
    public static MainBody body = new MainBody();
}

class MainBody implements LambdaForm {
    public int arity(){ return 1; }
    public Expr call(AtomExpr[] args){
	return args[1];
    }
}
