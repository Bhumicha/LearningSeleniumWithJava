package WaysInsertDataIntoVariables;

public class WaysToStoreDataIntoVariables1 {
    public static void main (String[] args)
    {
        /*
        //using object reference variables
        WaysToStoreDataIntoVariables st = new WaysToStoreDataIntoVariables();
        st.a =1;
        st.b="Bhumi";
        st.c='A';
        st.printData();
         */

        /*
        //using method
        WaysToStoreDataIntoVariables st = new WaysToStoreDataIntoVariables();
        st.printData2(1,"Sita", 'A');
        st.printData();
        */

        //using constructor
        WaysToStoreDataIntoVariables st = new WaysToStoreDataIntoVariables(1,"Srija",'C');
        st.printData();
    }
}
