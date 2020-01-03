package jp.bcat;
import java.io.*;

/*コマンドラインインターフェース(CLICommand.java)
 *
 * 各コマンドクラス共通のprocess()メソッドをもつ
 * 各コマンドクラスのスーパークラス
 *
 */

public interface CLICommand {
	public void process(BufferedReader in, PrintWriter out)
		throws IOException;
}