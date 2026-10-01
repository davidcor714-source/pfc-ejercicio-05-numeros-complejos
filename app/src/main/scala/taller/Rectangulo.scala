package taller

/** Punto 1. Un rectángulo dado por su base y su altura, ambas enteras. Los
  * objetos no cambian: rotar y escalar devuelven un rectángulo nuevo.
  *
  * Tal como está compila y las pruebas quedan en rojo.
  */
class Rectangulo(b: Int, h: Int) {

  // Selectoras: la base y la altura con que se construyó el rectángulo.
  def base: Int = b // Completar

  def altura: Int = h // Completar

  def area: Int = base * altura // Completar

  def perimetro: Int = base*2 + altura*2// Completar

  def esCuadrado: Boolean = {
     if (base == altura) true
     else false
  }// Completar

  // El rectángulo con base y altura intercambiadas.
  def rotar: Rectangulo = new Rectangulo(altura, base)// Completar

  // El rectángulo con los dos lados multiplicados por k.
  def escalar(k: Int): Rectangulo = new Rectangulo(base*k, altura*k) // Completar

  // Si este rectángulo entra dentro de otro, tal cual o rotado.
  def cabeEn(otro: Rectangulo): Boolean = {
    if (base <= otro.base || altura <= otro.altura) true
    else false
  } // Completar

  // El de mayor área entre este y otro; con áreas iguales, este.
  def elMayor(otro: Rectangulo): Rectangulo =
  {
    val aux = new Rectangulo(base, altura)
    if (otro.area >  aux.area) otro
    else aux
  } // Completar

  // La forma "3x4": base, la letra x y altura.
  override def toString: String = {this.base+"x"+this.altura} // Completar
}
