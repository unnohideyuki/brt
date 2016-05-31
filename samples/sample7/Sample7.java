import jp.ne.sakura.uhideyuki.brt.brtsyn.*;
import jp.ne.sakura.uhideyuki.brt.runtime.*;

/** Sample7 -- A sample of STG evaludation, corresponding to:

  main = let
    f = putStrLn
    e = f "Hello, Let Expression!"
   in e

 */
public class Sample7 {
    public static void main(String[] args){
	String[] ns = {"Main.l1.f", "Main.l1.e"};
	Expr f = RTLib.putStrLn;
	Expr e = RTLib.app(new AtomExpr(new FVar("Main.l1.f")),
			   RTLib.fromJString("Hello, Free Variable!"));
	Expr[] es = {f, e};
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
