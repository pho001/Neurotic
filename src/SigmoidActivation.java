public class SigmoidActivation implements Activation{
    @Override
    public Tensor forward(Tensor input) {
        return input.sigmoid();
    }
}
