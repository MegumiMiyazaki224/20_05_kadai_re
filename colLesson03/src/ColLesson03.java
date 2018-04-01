import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[5];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください

        int i = 0;

        while(!input.equals("e")){
            if(i > 4){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }

            String[] tmp = input.split(" "); // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
            Word wd = new Word(tmp[0], tmp[1]);
            words[i] = wd;
            i++;
            System.out.println("次の単語と意味を入力して下さい。eで終了します。");
            input = sc.nextLine();

        }



        //登録表示
        //単語が登録されている配列の件数を持ってくる必要がある
        for(int x = 0; x < i; x++){
            System.out.println(words[x]);
        }
        //こっちも配列の件数を持ってくる必要がある
        System.out.println( i + "件、登録しました。");

    }
}

