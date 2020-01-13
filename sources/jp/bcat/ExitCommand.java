package jp.bcat;
import java.io.*;

/*終了コマンド(ExitCommand.java)
 *
 * 終了メッセージを表示してプログラムを終了する
 *
 */

public class ExitCommand implements CLICommand{
	protected BookCatalog catalog;

	public void process(BufferedReader in,PrintWriter out){
		out.println("終了します。");
		out.flush();
		System.exit(0);
	}
}

