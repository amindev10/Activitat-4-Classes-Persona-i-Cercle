class Persona() {
    private var nom: String = ""
    private var cognoms: String = ""
    private var dni: String = ""
    private var estatcivil: Boolean = false
    private var edat: Int = 0

    constructor(nom: String, cognoms: String) : this() {
        this.nom = nom
        this.cognoms = cognoms
    }

    constructor(nom: String, cognoms: String, dni: String, estatcivil: Boolean, edat: Int) : this() {
        this.nom = nom
        this.cognoms = cognoms
        this.dni = dni
        this.estatcivil = estatcivil
        this.edat = edat
    }


    fun aniversari() {
        edat++
        println("Mi aniversario es $edat")
    }

    fun casament() {
        estatcivil = true
        println("Está casado")
    }

    fun divorci() {
        estatcivil = false
        println("Está divorciado")
    }

    override fun toString(): String {
        return "Persona(nom='$nom', cognoms='$cognoms', dni='$dni', estatcivil=$estatcivil, edat=$edat)"
    }

}
