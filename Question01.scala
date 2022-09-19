object question01 extends App{

    var p1 = Point(3,7);
    var p2 = Point(5,9);

    println(p1);
    println(p2);

    println(p1.add(p2));

    p1.move(2, 3);
    println(p1);

    var d1 = p1.distance(p2)
    println(d1);

    p1.invert()
    println(p1)

}

case class Point(var x:Int, var y:Int) {  

        def add(p:Point) = new Point(x+p.x, y+p.y)

        def move(m:Int, n:Int) ={
            this.x = this.x + m;
            this.y = this.y + n;
        } 

        def distance(a:Point) = {
            var xDistance = x - a.x;
            var yDistance = y - a.y;
            var dist = xDistance*xDistance + yDistance*yDistance; 
            scala.math.sqrt(dist)
        }

        def invert() = {
            var temp = this.x;
            this.x = this.y;
            this.y = temp;
        }
    }