import org.newdawn.slick.{AppGameContainer, Graphics, GameContainer, BasicGame}

class Game extends BasicGame("A Slick2d game") {

  var counter = 0

  def init(container: GameContainer) {}

  def update(container: GameContainer, delta: Int) {
    counter = counter + 1
  }

  def render(container: GameContainer, g: Graphics) {
    g.drawString(s"Hello $counter!", 50, 50)
  }
}

object Game extends App {

  new AppGameContainer(new Game) {
    setDisplayMode(800, 600, false)
    setForceExit(false)
    start
  }

}
