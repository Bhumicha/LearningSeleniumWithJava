package Methods;

import org.openqa.selenium.json.JsonOutput;

public class MainMethod {
    public static void main(String[]args)
   /*
   // no params and no return value
   {
        Methods gr = new Methods();
        gr.m1();
    }

    */
    /* //no params and return value
   {
        Methods gr = new Methods();
        String s = gr.m2();
        System.out.println(s);
    }
       */
            /* // takes params but no return value
    {
        Methods gr = new Methods();
        gr.m3("Bhumi");
    }

             */ //takes params and returns value
    {
        Methods gr = new Methods();
        String s = gr.m4("Bhumika");
        System.out.println(s);
    }




}
