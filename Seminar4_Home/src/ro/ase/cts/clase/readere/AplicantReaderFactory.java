package ro.ase.cts.clase.readere;

public class AplicantReaderFactory {
    private static AplicantReaderFactory instance = null;

    private AplicantReaderFactory() {
    }

    public static synchronized AplicantReaderFactory getInstance() {
        if (instance == null) {
            instance = new AplicantReaderFactory();
        }

        return instance;
    }

    public AplicantReader createReader(TipReader tipReader, String filePath) throws Exception {
        return switch (tipReader) {
            case readerAngajat -> new AngajatiReader(filePath);
            case readerElev -> new EleviReader(filePath);
            case readerStudent -> new StudentiReader(filePath);
            default -> throw new Exception("Invalid Type");
        };
    }
}
