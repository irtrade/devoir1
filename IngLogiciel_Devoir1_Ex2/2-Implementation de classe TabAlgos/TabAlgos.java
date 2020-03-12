/**
*CLasse TabAlgos.
**/
public final class TabAlgos {
/**
*Constructeur privé non accessible.
**/
private TabAlgos() {
}
/**
* @return valeur la plus grande d'un tableau.
* @param tab le tableau a traiter.
*/
  public static int plusGrand(final int[] tab) {
if (tab == null || tab.length == 0) {
throw new IllegalArgumentException("Tableau vide ou null");
}
  int val = tab[0];
  for (int i = 0; i < tab.length; i++) {
if (tab[i] >= val) {
val = tab[i];
}
}
  return val;
}
/**
*@return moyenne des valeurs du tableau.
*@param tab le tableau a traiter.
*@throw IllegalArgumentException si tab et null ou vide.
**/
  public static double moyenne(final int[] tab) {
if (tab == null || tab.length == 0) {
throw new IllegalArgumentException("Tableau vide ou null");
}
int val = 0;
for (int i = 0; i < tab.length; i++) {
val += tab[i];
}
return val / tab.length;
}
/**
*Compare le contenu de 2 tableaux en tenant compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments.
*avec les mêmes nombres d'occurences.
*(avec les elements dans le meme ordre).
*@param tab1 le tableau 1  a comparer.
*@param tab2 le tableau 2  a comparer.
**/
public static boolean egaux(final int[] tab1, final int[] tab2) {
if (tab1 == null) {
throw new IllegalArgumentException("Le tableau 1 est null");
}
if (tab2 == null) {
throw new IllegalArgumentException("Le tableau 2 est null");
}
if (tab1.length != tab2.length) {
return false;
}
for (int i = 0; i < tab1.length; i++) {
if (tab1[i] != tab2[i]) {
return false;
}
}
return true;
}
/**
*Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
*@return true si les 2 tableaux contiennent les mêmes éléments
* avec les mêmes nombres d'occurrence.
*(pas forcément dans le meme ordre).
* @param tab1 le tableau 1  a comparer.
* @param tab2 le tableau 2  a comparer.
**/
public static boolean similaires(final int[] tab1, final int[] tab2) {
return egaux(trierTableau(tab1), trierTableau(tab2));
}
/**
*@return trie le tableau passer en parametre
*@param tab le tableau  a trier.
**/
protected static int[] trierTableau(final int[]tab) {
if (tab == null) {
throw new IllegalArgumentException("Le tableau est null");
}
boolean permuter = true;
int j = 0;
int tamp;
while (permuter) {
permuter = false;
j++;
for (int i = 0; i < tab.length - j; i++) {
if (tab[i] > tab[i + 1]) {
tamp = tab[i];
tab[i] = tab[i + 1];
tab[i + 1] = tamp;
permuter = true;
}
}
}
return tab;
}
}
