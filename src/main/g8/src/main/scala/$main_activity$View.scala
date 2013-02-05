package $package$

import _root_.android.content.Context
import _root_.android.graphics.Canvas
import _root_.android.graphics.Color
import _root_.android.graphics.Paint
import _root_.android.view.View

class $main_activity$View(context: Context) extends View(context) {

  setBackgroundColor(Color.WHITE)

  val paint = new Paint()
  paint.setTextSize(50: Float)
  
  override def onDraw(canvas: Canvas) {
    canvas.drawText("Hello world!",0,50,paint)
  }
}
