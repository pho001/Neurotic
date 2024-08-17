import java.util.HashSet;

public class LinearLayer extends Layer{
    boolean useBias=true;

    Tensor weights=null;
    Tensor bias=null;
    Tensor [] out=null;

    int inputs;
    int outputs;


    int rows=0;
    int cols=0;
    int depth;
    public LinearLayer(int features_in, int features_out, boolean useBias, Initializer init){
        //super();
        this.useBias=useBias;
        this.rows=features_in;
        this.cols=features_out;
        this.inputs=features_in;
        this.outputs=features_out;
        this.weights=init.init(features_in,features_out);

        //this.weights=new Tensor(this.rows,this.cols, new HashSet<>(), "Weights").randTensor().muleach(1/(Math.pow(this.rows,2)));
        this.weights.label="Weights";
        if (this.useBias==true)
            this.bias= new Tensor(1, cols, new HashSet<>(), "Bias").zeros();
    }

    @Override
    public Tensor[] forward(Tensor[] input) {
        this.out=new Tensor[input.length];

        for (int i=0;i<input.length;i++) {
            out[i]=linear(input[i]);
        }
        return out;
    }
    
    public Tensor linear(Tensor input) {
        Tensor out=null;
        if (this.useBias) {
            out = input.mul(this.weights).addb(this.bias);
        } else {
            out = input.mul(this.weights);
        }
        return out;
    }

    @Override
    public HashSet<Tensor> parameters() {
        HashSet <Tensor> params=new HashSet<>();
        params.add(this.weights);
        if (useBias)
            params.add(this.bias);
        return params;
    }

    @Override
    public void initParameters(Initializer init) {
        this.weights=init.init(inputs,outputs);
        this.weights.label="Weights";
    }
}
