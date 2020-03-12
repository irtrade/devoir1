/**
* Ma class d'exemple.
*/
public class Exemple2 {
/**
* @param t
*/
 private final String t;
 /**
 * @param v
 */
 private int v;
 /**
 * @param arg initialise la valeur de v au constructeur
 */
public Exemple2(final String arg) {
this.t = arg;
}
/**
* @return la valeur de v
*/
public final int getV() {
return this.v;
}
/**
* @param arg edite la valeur v de la classe
*/
public final void setV(final int  arg) {
this.v = arg; }
/**
* @return t si v est positif
*/
public final String getT() {
if (v > 0) {
return t;
}
return null;
}
}
