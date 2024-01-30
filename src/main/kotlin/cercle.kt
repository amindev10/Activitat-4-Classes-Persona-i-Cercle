import kotlin.math.PI

class Cercle {
    var radi: Float = 0.0F
    var color: String = "blanc"

    constructor()

    constructor(radi: Float) : this() {
        this.radi = radi
    }

    constructor(radi: Float, color: String): this() {
        this.radi = radi
        this.color = color
    }

    fun permimetre(): Float {
        return 2 * PI.toFloat() * radi
    }

    fun area(): Float {
        return PI.toFloat() * radi * radi
    }

    override fun toString(): String {
        return "El radi es: $radi, El color es: $color"
    }
}