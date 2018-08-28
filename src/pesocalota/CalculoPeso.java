package pesocalota;

public class CalculoPeso
{
    private final float diametroExterno, diametroFuro, alturaCalota;
    private final float raioEsferico, peso;

    CalculoPeso(float diametroExterno, float diametroFuro,
            float alturaCalota, float raioEsferico)
    {
        this.alturaCalota = alturaCalota;
        this.diametroExterno = diametroExterno;
        this.diametroFuro = diametroFuro;
        this.raioEsferico = raioEsferico;

        this.peso = (PesoRaio(this.diametroExterno) + PesoReto(this.diametroExterno)) -
                    (PesoRaio(this.diametroFuro) + PesoReto(this.diametroFuro));
    }
    
    public float GetPeso()
    {
        return this.peso;
    }

    private float AlturaRaio(float raio, float diametro)
    {
        float alturaRaio = (float) (raio - Math.sqrt(Math.pow(raio, 2) - Math.pow(diametro / 2, 2)));

        return alturaRaio;
    }

    private float VolumeEsferico(float diametro)
    {
        float alturaRaio = AlturaRaio(this.raioEsferico, diametro);

        float volumeEsferico = (float) (Math.PI * Math.pow(alturaRaio, 2) * 
                (3 * this.raioEsferico - alturaRaio)) / 3;

        return volumeEsferico;
    }
    
    private float PesoRaio(float diametro)
    {
        float pesoRaio = (float) (VolumeEsferico(diametro) * 0.00000785);

        return pesoRaio;
    }
    
    private float PesoReto(float diametro)
    {
        float areaBase = (float) (Math.PI * Math.pow(diametro / 2, 2));
        float alturaReta = this.alturaCalota - AlturaRaio(this.raioEsferico, diametro);
        float pesoReto = (float) ((alturaReta * areaBase) * 0.00000785);

        return pesoReto;
    }
}
