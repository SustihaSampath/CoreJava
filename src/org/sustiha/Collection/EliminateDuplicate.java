package org.sustiha.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sustihashreesampath on 12/21/16.
 */
public class EliminateDuplicate {


    public static void main(String [] args)
    {
        List<String> names = new ArrayList<>();
        names.add("sustiha");
        names.add("suStiha");
        String str = "Sustiha";

        for(String s:names)
        {
            if(str.equalsIgnoreCase(s))
            {
                System.out.println("available");
            }

        }

    }


}
