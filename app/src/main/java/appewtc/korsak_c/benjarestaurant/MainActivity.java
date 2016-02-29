package appewtc.korsak_c.benjarestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Explictie
    private  MyManage myManage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManage = new MyManage(this);

        //Test add value
        testAddValue();

    }   // Main Method

    private void testAddValue() {
        myManage.addUser("testUser", "1234", "โดเรมอน");
        myManage.addFood("ไข่เจียว", "100", "urlFood");
    }

}   // Main Class
