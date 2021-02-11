package patterns.creational.builder;

public class ObjectToBuild {

    public static class Builder {

        private String var1;
        private String var2;
        private String var3;
        private String var4;

        public ObjectToBuild build() {
            return new ObjectToBuild(this);
        }

        public Builder var1(String var1) {
            this.var1 = var1;
            return this;
        }

        public Builder var2(String var2) {
            this.var2 = var2;
            return this;
        }

        public Builder var3(String var3) {
            this.var3 = var3;
            return this;
        }

        public Builder var4(String var4) {
            this.var4 = var4;
            return this;
        }

    }

    private String var1;
    private String var2;
    private String var3;
    private String var4;

    public ObjectToBuild(Builder builder) {
        this.var1 = builder.var1;
        this.var2 = builder.var2;
        this.var3 = builder.var3;
        this.var4 = builder.var4;
    }

    @Override
    public String toString() {
        return "ObjectToBuild{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                ", var3='" + var3 + '\'' +
                ", var4='" + var4 + '\'' +
                '}';
    }
}
