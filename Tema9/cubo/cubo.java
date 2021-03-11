public class cubo {
int capacidad;
int contenido;

//constructor
cubo(int c) {
  this.capacidad=c;
}
// métodos getter
int getCapacidad() {
return this.capacidad;
}
int getContenido() {
return this.contenido;
}
//metodos setter
void setContenido(int litros) {
this.contenido = litros;
}
// otros métodos
void vacia() {
this.contenido = 0;
}
void llena() {
this.contenido = this.capacidad;
}
void pinta() {
for (int nivel = this.capacidad; nivel > 0; nivel--) {
if (this.contenido >= nivel) {
System.out.println("#~~~~#");
} else {
System.out.println("# #");
}
}
System.out.println("######");
}

void vuelcaEn(cubo destino) {
int libres = destino.getCapacidad() - destino.getContenido();
if (libres > 0) {
if (this.contenido <= libres) {
destino.setContenido(destino.getContenido() + this.contenido);
this.vacia();
} else {
this.contenido -= libres;
destino.llena();
}
}
}
}
