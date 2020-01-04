package jp.bcat;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*図書一覧コマンド(ListCommand.java)
 *
 * 図書の総数と各図書の情報を出力する
 *
 */

public class ListCommand implements CLICommand{
	protected BookCatalog catalog;

	public ListCommand(BookCatalog catalog) {
		this.catalog = catalog;
	}

	public void process(BufferedReader in,PrintWriter out)throws IOException{


	}
}

