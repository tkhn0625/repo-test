package mainthread;

import java.util.HashMap;
import rcgString.RecogStringClass;

public class MainRecogClass {

    public static void main(String[] args) {

        //生データ
        String[] str_list = {"patocar","lplpl","micky","apple","huhuhuh","lplpl"};

        //候補データ(csvから読み取る)
        String[] fruite_list = {"orange","suika","appl"};
        String[] viecle_list = {"bicycle","patocar","bike"};
        String[] character_list = {"micky","miny","dragon"};

        //logファイルデータの生成
        HashMap<String,String > log_map=new HashMap<>();
        log_map.put("Fruite","9");
        log_map.put("Viecle","3");
        log_map.put("Character","5");


        //Hashmap<String,String[]>への値の格納
        HashMap<String, String[]> column_map = new HashMap<String, String[]>();
        //log_mapと同じkey名に設定する。
        column_map.put("Fruite",fruite_list);
        column_map.put("Viecle",viecle_list);
        column_map.put("Character",character_list);

        //引数(HashmMap<String,String>,HashMap<String,String[]>,List[])_返り値(HashMap)
        log_map = RecogStringClass.return_index_map(log_map,column_map,str_list);

        System.out.println(log_map);

    }
}
