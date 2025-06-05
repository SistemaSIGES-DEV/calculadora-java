# 📦 Repositorio Modelo de Buenas Prácticas

Este repositorio sirve como **modelo general de trabajo en equipo y buenas prácticas** para el desarrollo de software. Está pensado como punto de partida para proyectos en distintos lenguajes, mostrando cómo organizar un repositorio, estructurar código, trabajar con ramas y automatizar pruebas.

> Este ejemplo usa un proyecto de **calculadora** como caso práctico, pero el enfoque puede adaptarse fácilmente a otros lenguajes y propósitos.

---

## 🎯 Objetivos del repositorio

- Establecer un flujo de trabajo basado en ramas (branching model).
- Promover el desarrollo guiado por pruebas (TDD).
- Documentar buenas prácticas de commits, revisiones y PRs.
- Incluir integración continua (CI) para validación automática.
- Servir como plantilla para nuevos repositorios.

---

## 🧭 Estructura del repositorio
- main
    - develop
        - feature/NombreRama


---

## 🚀 Pasos seguidos en este proyecto

1. **Creación del repositorio**
   - Desde un template de la organización.
   - Inicializado con `.gitignore` para Java y `README.md`.

2. **Estructuración del proyecto**
   - Organización de carpetas para código y pruebas.
   - Convenciones de nombres consistentes.

3. **Trabajo con ramas**
   - Uso de ramas `feature/`, `hotfix/`, `release/`, `main`.
   - `main` protegida contra escritura directa.

4. **Pull Requests**
   - Revisión requerida por al menos un miembro del equipo.
   - CI obligatoria para aprobar cambios.

5. **Integración continua**
   - GitHub Actions ejecuta tests automáticamente al hacer push o PR.
   - No se puede fusionar código que no pase las pruebas.

---

## 🧪 Buenas prácticas aplicadas

- **Commits atómicos y descriptivos** (ej. `feat: agregar operación de suma`).
- **TDD**: los tests se escriben antes que la implementación.
- **Revisión de código** mediante Pull Requests obligatorios.
- **Rama principal protegida** (`main`).
- **Documentación clara** y mantenida.

    ![Logo de la organización](assets/SIGES_Imagen.ico)

