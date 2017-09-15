package wodule.com.wodule.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import wodule.com.wodule.R;
import wodule.com.wodule.fragment.Frm_Part1_a;
import wodule.com.wodule.object.ResponResult;

public class ActAssessmentStartA extends AppCompatActivity {
    private Fragment fragment;
    private FragmentManager fragmentManager;
    public static ResponResult storeresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_assessment_start_a);
        fragmentManager = getSupportFragmentManager();
        fragment = new Frm_Part1_a();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentHolder, fragment).commit();
    }
}
