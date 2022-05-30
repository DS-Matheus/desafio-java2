package Singleton;

//Singleton "Lazy Holder"
//https://stackoverflow.com/a/24018148/

public class SingletonLazyHolder {

        private static class InstanceHolder{
                public static SingletonLazyHolder instancia = new SingletonLazyHolder();
        }

        private SingletonLazyHolder(){
                super();
        }

        public static SingletonLazyHolder getInstancia(){
                return InstanceHolder.instancia;
        }
}