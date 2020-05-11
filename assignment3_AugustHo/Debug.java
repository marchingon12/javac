enum Operator {
  ADD, SUBTRACT, MULTIPLY, DIVIDE
}

class Expression {
  double left_, right_;
  Operator op_;

  Expression(double left, double right, Operator op){
    this.left_  = left;
    this.right_ = right;
    this.op_    = op;
  }

  double evaluate() {
    double result = 0;                            // double result added for simplicity
    switch (this.op_) {
      case ADD:                                   // ADD instead of Operator.ADD
        return result = this.left_ + this.right_; // return result if case ADD
      case SUBTRACT:                              // SUBTRACT instead of Operator.SUBTRACT
        return result = this.left_ - this.right_; // return result if case SUBTRACT
      case MULTIPLY:                              // MULTIPLY instead of Operator.MULTIPLY
        return result = this.left_ * this.right_; // return result if case MULTIPLY
      case DIVIDE:                                // DEVIDE instead of Operator.DEVIDE
        return result = this.left_ / this.right_; // return result if case DEVIDE
    }
    return result; //return statement missing
  }
}

class Debug {

  public static void main(String[] args) {
    Operator[] ops = new Operator[5];
    ops[0] = Operator.ADD;      // expected value 5
    ops[1] = Operator.SUBTRACT; // expected value -1
    ops[2] = Operator.MULTIPLY; // expected value 6
    ops[3] = Operator.DIVIDE;   // expected value 0.66666...

    Expression[] exp = new Expression[ops.length];
    for (int i = 0; i < ops.length; ++i) {
      exp[i] = new Expression(2, 3, ops[i]);
    }

    for (int i = 0; i < ops.length; ++i) {
      System.out.println(exp[i].evaluate());
    }
  }
}

/*

Zeile 17: "Operator" darf man nicht mitgeschrieben werden, nur die Inhalt in enum.
Fehlermeldung:
Debug.java:17: error: an enum switch case label must be the unqualified name of an enumeration constant
      case Operator.ADD:
Operator ist eine enumeration. Switch case darf nur die Inhalte (ADD, SUBTRACT, MULTIPLY und DEVIDE)
benutzen. Daher soll "Operator" entfernt werden.

Zeile 26: Ein return statement ist nötig.
Debug.java:26: error: missing return statement
  }
  ^
1 error
Eine Lösung wäre eine double zu initieren,



*/
