package nl.lance.dribbble.activites;

import android.os.Bundle;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;
import nl.lance.dribbble.R;
import nl.lance.dribbble.shots.fragment.PlayerCollection;
import nl.lance.dribbble.shots.fragment.ShotsCollection;

public class DActivity extends SwipeBackActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_d);

    String s = getIntent().getExtras().getString("is");

    if(s.equals("Shots")) {
      getSupportFragmentManager().beginTransaction()
              .replace(R.id.container, new ShotsCollection()).commit();
    } else if (s.equals("Player")) {
      getSupportFragmentManager().beginTransaction()
              .replace(R.id.container, new PlayerCollection()).commit();
    }
  }
}
