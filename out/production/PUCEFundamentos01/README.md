# PUCEFundamentos01
## 🚀 Taller Autónomo - Operación Código Legacy

**Integrantes:**
*Naomi Jurado
*Odalis Bonilla

# FASE 1 INGENIERIA INVERSA - EXPLICACIÓN

## 1. ¿Qué problema resuelve esta aplicación?

Es un simulador de matriculas particularmente de la Tecnologia en Desarrollo De software.
Esta aplicación tiene como objetivo evaluar si un estudiante puede matricularse o no en la materia 'Estructura de datos', basandose en la verificación del requisito previo (es obligatorio haber cursado y aprobado la materia 'Fundamentos de Programación' con una nota mínima de 7.0) para acceder a esta materia. 

## 2. Descripción del flujo de datos

A continuación se describe el como opera el sistema de matrícula.

### Ingreso de Datos Iniciales (Inputs)
El programa solicita:
  *Nombre del estudiante ('urs')*
  *¿Es estudiante de reingreso o arrastre? ('s/n')*

 ### Historial de Respuestas
 *- Si el estudiante responde Sí ('S'):* el programa asume que ya se ha cursado materias anteriormente.
 Lo que resgistra en su historial ('h_materias') la materia de 'Fundamentos de Programación'.
 Inmediatamente, imprime un mensaje donde solicita ingresar la nota final obtenida de la materia ('n1'); la nota se convierte en un valor numerio decimal ('double').

 *- Si el estudiante responde No ('N'):* el programa asume que el estudiante es de nuevo ingreso, de primer sementre, y se salta el input de la nota final.

### Solicitud de Cupo
El programa pregunta: 
 *¿Desea solicitar el cupo para esta materia? ('s/n')*
 ### Historial de Respuestas
 *- Si el estudiante responde Sí ('S'):* el programa evalua si cumple con los requisitos para proporcionar el cupo.

 *- Si el estudiante responde No ('N'):* el programa imprime un mensaje de despedida: "Proceso finalizado. No se solicitaron materias de segundo nivel" y por último, se cierra el sistema de matrícula.
  
## 3. Resumen 
El sistema evalua tres posibles resultados o escenarios: 

  *Matrícula Aprobada:* Si el estudiante es de reingreso ('S') y registra una nota >= a 7.0 en "Fundamentos de Programación", cumple con el prerrequisito.

  *Matrícula Rechazada por nota:* Si es de reingreso ('S') pero su nota < a 7.0, el sistema rechaza la solicitud por no alcanzar el puntaje mínimo.

  *Matrícula Rechazada por falta de prerrequisito:* Si el estudiante es de nuevo ingreso ('N'), no tendrá la materia en su historial, lo que resulta con el rechazo de la matrícula por no contar con el prerrequisito.

  *Nota de cierre:* Si el estudiante decide no solicitar el cupo (respondiendo "N"), el sistema detiene el proceso de inmediato con el mensaje: "Proceso finalizado. No se solicitaron materias de segundo nivel."

### 4. Funcionalidad extra 
 Se implemento una nueva regla: 
 Si el estudiante obtiene nota perfecta de 10.0 en el prerrequisito, el sistema aprueba la matricula y adicionalmemte muestra :
 "FELICIDADES ha sido seleccionad@ como tutor de programacion del PUCE TEC.\nMATRICULA APROBADA: cumple con el prerrequisito con notav perfecta!!"









