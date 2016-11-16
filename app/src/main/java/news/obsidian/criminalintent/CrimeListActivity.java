package news.obsidian.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Bryan on 9/19/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
