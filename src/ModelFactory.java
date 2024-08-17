public class ModelFactory {
    public static Model MLP(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,Encoder encoder,boolean useBias,Initializer init){
        return new MLP(contextLength,featuresIn,hiddenLayers,featuresOut,encoder,useBias,init);
    }
    public static Model MLP(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,boolean useBias,Initializer init){
        return new MLP(contextLength,featuresIn,hiddenLayers,featuresOut,useBias,init);
    }

    public static Model RNN(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,Encoder encoder,boolean useBias,Initializer init){
        return new RNN(contextLength,featuresIn,hiddenLayers,featuresOut,encoder,useBias,init);
    }
    public static Model RNN(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,boolean useBias,Initializer init){
        return new RNN(contextLength,featuresIn,hiddenLayers,featuresOut,useBias,init);
    }

    public static Model LSTM(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,Encoder encoder,boolean useBias,Initializer init){
        return new LSTM(contextLength,featuresIn,hiddenLayers,featuresOut,encoder,useBias,init);
    }
    public static Model LSTM(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,boolean useBias,Initializer init){
        return new LSTM(contextLength,featuresIn,hiddenLayers,featuresOut,useBias,init);
    }

    public static Model GRU(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,boolean useBias,Initializer init){
        return new GRU(contextLength,featuresIn,hiddenLayers,featuresOut,useBias,init);
    }

    public static Model GRU(int contextLength,int featuresIn, int [] hiddenLayers, int featuresOut,Encoder encoder,boolean useBias,Initializer init){
        return new GRU(contextLength,featuresIn,hiddenLayers,featuresOut,encoder,useBias,init);
    }

    public static Model custom(int contextLength, int featuresIn, int [] hiddenLayers, int featuresOut,Encoder encoder,boolean useBias,Initializer init){
        return new CustomModel(contextLength, featuresIn,hiddenLayers,featuresOut,encoder, useBias,init);
    }
    public static Model custom(int contextLength, int featuresIn, int [] hiddenLayers, int featuresOut,boolean useBias,Initializer init){
        return new CustomModel(contextLength, featuresIn,hiddenLayers,featuresOut,useBias,init);
    }
}
