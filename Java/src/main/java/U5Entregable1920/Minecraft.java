package U5Entregable1920;

public class Minecraft extends Material {
  Material[] material;

  public Minecraft(Material[] material) {
    super();
    this.material = new Material[10];
  }

  void borrarMaterialSinMasa() {
    for (int i = 0; i < material.length; i++) {
      if (material[i].masa > 0) {
        material[i] = null;
      }
    }
  }

  void mostrarEstado() {}
}
