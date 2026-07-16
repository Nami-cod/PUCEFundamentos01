void main() {
    println("""
        ===========================================
        |   SISTEMA DE MATRÍCULA - PUCE TEC       |
        |      Carrera de Desarrollo de Software  |
        ===========================================
        """);

    String nombreEstudiante = "";
    String materialPrerrequisito = "Fundamentos de Programación";
    double notaPrerrequisito = 0.0;

    nombreEstudiante = readln("Ingrese el nombre del estudiante: ");
    String respuestaReingreso = readln("¿Es estudiante de reingreso o arrastre? (S/N): ");

    String[] historialMaterias = null;

    if (respuestaReingreso.equalsIgnoreCase("S")) {
        historialMaterias = new String[]{ materialPrerrequisito };
        String inputNota = readln("Ingrese la nota final obtenida en '" + materialPrerrequisito + "' (0-10): ");
        notaPrerrequisito = Double.parseDouble(inputNota);
    } else {
        println("-> Registrado como estudiante de Primer Semestre...");
    }

    println("\n--- MATERIA A SOLICITAR ---");
    println("Materia destino: [ Estructuras de Datos ] (Requisito: Haber aprobado Fundamentos con >= 7.0)");
    String respuestaCupo = readln("¿Desea solicitar el cupo para esta materia? (S/N): ");

    if (respuestaCupo.equalsIgnoreCase("S")) {
        boolean cumplePrerrequisito = false;

        if (historialMaterias != null) {
            for (int i = 0; i < historialMaterias.length; i++) {
                if (historialMaterias[i].equals(materialPrerrequisito)) {
                    cumplePrerrequisito = true;
                }
            }

            String resultadoMatricula = switch (String.valueOf(cumplePrerrequisito)) {
                case "true" -> {
                    if (notaPrerrequisito >= 7.0) {
                        if (notaPrerrequisito == 10.0) {
                            yield "FELICIDADES ha sido seleccionad@ como tutor de programacion del PUCE TEC.\nMATRICULA APROBADA: cumple con el prerrequisito con notav perfecta!!";
                        } else {
                            yield "MATRÍCULA APROBADA: cumple con el prerrequisito con nota" + notaPrerrequisito;
                        }
                    } else {
                        yield "MATRICULA RECHAZADA: Reprobo el prerrequisito con " + notaPrerrequisito;
                    }
                }
                case "false" -> "MATRÍCULA RECHAZADA: No cuenta con el prerrequisito en su historial.";
                default -> "Error del sistema.";
            };

            println("\n[RESULTADO]: " + resultadoMatricula);

        } else {
            println("\nProceso finalizado. No se solicitaron materias de segundo nivel.");
        }
    }

    // NOTA: No Corre el programa debido a un problema de la estructuracion del archivo java. No esta reconociendo las carateristicas experimentales.

