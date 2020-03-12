import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabAlgosTest {
	/**
	 * Teste la fonction Plusgrand
	 */
	@Test
	void testPlusGrand() {
		assertEquals(44,TabAlgos.plusGrand(new int[]{ 1,20,3,7,13,44,5,9,10,2 }));
	}
	
	/**
	 * Teste Si le tableau  est null ou vide dans la fonction Plusgrand
	 */
	@Test
	void testPlusGrandNullVide() {
		try {
			TabAlgos.plusGrand(null);
			TabAlgos.plusGrand(new int[] {});
			 fail("l'exception pour le tableau a valeur null ou vide aurait dû être levée");
			}
		 catch(IllegalArgumentException e) {
	        // Si tout fonctionne bien
	      }
	}

	/**
	 * Teste la fonction moyenne
	 */
	@Test
	void testMoyenne() {
		assertEquals(18,TabAlgos.moyenne(new int[]{4,70,13,5,11,6}));
	}
	
	/**
	 * Teste Si le tableau  est null ou vide dans la fonction moyenne
	 */
	
	@Test
	void testMoyenneNullVide() {
		try {
		TabAlgos.moyenne(null);
		TabAlgos.moyenne(new int[] {});
		 fail("l'exception pour le tableau a valeur null ou vide aurait dû être levée");
		}
	 catch(IllegalArgumentException e) {
        // Si tout fonctionne bien
      }
		}
	/**
	 * Teste la fonction egaux
	 */

	@Test
	void testEgaux() {

           assertFalse(TabAlgos.egaux(new int[]{4,70,13,5,6,11},new int[]{4,70,13,5,11,6}));
	}
	
	/**
	 * Teste Si le tableau 1 est null dans la fonction Egaux
	 */
	@Test
	void testEgauxNullTab1() {

		try {
			TabAlgos.egaux(null,new int[]{});
			 fail("l'exception pour le tableau 1 a valeur null aurait dû être levée");
			}
		 catch(IllegalArgumentException e) {
	        // Si tout fonctionne bien
	      }
	}
	
	/**
	 * Teste Si le tableau 2 est null dans la fonction Egaux
	 */
	@Test
	void testEgauxNullTab2() {

		try {
			TabAlgos.egaux(new int[]{},null);
			 fail("l'exception pour le tableau 2 a valeur null aurait dû être levée");
			}
		 catch(IllegalArgumentException e) {
	        // Si tout fonctionne bien
	      }
	}
	
	/**
	 * Teste la fonction Similaire
	 */

	@Test
	void testSimilaires() {
		 assertFalse(TabAlgos.similaires(new int[]{6,11,5,13,70,14},new int[]{4,70,13,5,11,6}));
	}
	
	
	/**
	 * Teste la fonction trierTableau
	 */
	
	@Test
	void testTrierTableau() {

		try {
			TabAlgos.trierTableau(null);
			 fail("l'exception pour le tableau a valeur null aurait dû être levée");
			}
		 catch(IllegalArgumentException e) {
	        // Si tout fonctionne bien
	      }
	}

	
	/**
	 * Teste Si le tableau a trier null dans la fonction trierTableau
	 */
	@Test
	void testTrierTableauNull() {

		try {
			TabAlgos.trierTableau(null);
			 fail("l'exception pour le tableau  a valeur null aurait dû être levée");
			}
		 catch(IllegalArgumentException e) {
	        // Si tout fonctionne bien
	      }
	}

}
