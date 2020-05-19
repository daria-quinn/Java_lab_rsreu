package rsreu;
interface Apple {
        long getApplePrice();
        }
interface HP {
    long getHPPrice();
}
interface ASUS {
    long getASUSPrice();
}
interface InteAbsFactory {
    Apple getApple();
    HP getHP();
    ASUS getASUS();
}
class AppleImp1 implements Apple{

    public long getApplePrice() {
        return 100000;
    }
}
class HPImp1 implements HP{
    public long getHPPrice() {
        return 50000;
    }
}
class ASUSImp1 implements ASUS{
    public long getASUSPrice() {
        return 70000;
    }
}
class UaNotebookPriceAbsFactory implements InteAbsFactory{
        public Apple getApple() {
            return new AppleImp1();
        }

    public HP getHP() {
        return new HPImp1();
    }

    public ASUS getASUS() {
        return new ASUSImp1();
    }
}
class RuAppleImpl implements Apple {// вторая
    public long getApplePrice() {
        return 90000;
    }
}
class RuHPImpl implements HP {
    public long getHPPrice() {
        return 30000;
    }
}
class RuASUSImpl implements ASUS {
    public long getASUSPrice() {
        return 88000;
    }
}
 class AbsFactory implements InteAbsFactory {
     public Apple getApple() {
         return new RuAppleImpl();
     }
     public HP getHP() {
         return new RuHPImpl();
     }
     public ASUS getASUS() {
         return new RuASUSImpl();
     }

}
