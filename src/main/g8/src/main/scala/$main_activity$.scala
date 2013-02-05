package $package$

import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.view.Window

class $main_activity$ extends Activity {
  override def onCreate(icicle: Bundle) {
    super.onCreate(icicle)
    requestWindowFeature(Window.FEATURE_NO_TITLE)
    setContentView(new $main_activity$View(this))
  }
}
