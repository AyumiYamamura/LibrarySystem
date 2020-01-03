package jp.bcat;
import java.io.*;


/*図書登録コマンド(AddCommand.java)
 *
 * タイトルや著者などの図書情報を1項目ずつコマンドラインから入力
 * 最後に入力確認をして図書目録へ登録する
 *
 */

public class AddCommand implements CLICommand{
	protected BookCatalog catalog;

	public AddCommand(BookCatalog catalog) {
		this.catalog = catalog;
}

	public void process(BufferedReader in,PrintWriter out)throws IOException{