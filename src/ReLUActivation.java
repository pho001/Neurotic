public class ReLUActivation implements  Activation{
    @Override
    public Tensor forward(Tensor input) {
        return input.ReLU();
    }
}
