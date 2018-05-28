/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakebuilder;

/**
 *
 * @author rau3
 */
public class Cake {

    private final String ingrediente1, ingrediente2, ingrediente3, ingrediente4, ingrediente5;

    public Cake(CakeBuilder builder) {
        this.ingrediente1 = builder.ingrediente1;
        this.ingrediente2 = builder.ingrediente2;
        this.ingrediente3 = builder.ingrediente3;
        this.ingrediente4 = builder.ingrediente4;
        this.ingrediente5 = builder.ingrediente5;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public String getIngrediente4() {
        return ingrediente4;
    }

    public String getIngrediente5() {
        return ingrediente5;
    }

    public static class CakeBuilder {

        private final String ingrediente1, ingrediente2;
        private String ingrediente3, ingrediente4, ingrediente5;

        public CakeBuilder(String ingrediente1, String ingrediente2) {
            this.ingrediente1 = ingrediente1;
            this.ingrediente2 = ingrediente2;
        }

        public CakeBuilder ingrediente3(String ingrediente3) {
            this.ingrediente3 = ingrediente3;
            return this;
        }

        public CakeBuilder ingrediente4(String ingrediente4) {
            this.ingrediente4 = ingrediente4;
            return this;
        }

        public CakeBuilder ingrediente5(String ingrediente5) {
            this.ingrediente5 = ingrediente5;
            return this;
        }

        public Cake build() {

            return new Cake(this);
        }

    }

}
