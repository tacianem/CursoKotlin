package functions;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class CallingKotlinFunction {

    public static void main(String[] args){
        ArrayList<String> list = CollectionsKt.arrayListOf("Lara", "Josefina", "Nair");
        System.out.println(ListSecondElementKt.secondOrNull(list));
    }
}
