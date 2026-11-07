# Banner Expansion (Fabric 1.21.1)

Adds exactly 20 banner patterns: 15 always-available Loom designs and 5 craftable Banner Pattern items.

## Requirements
- Minecraft Java Edition 1.21.1
- Fabric Loader 0.16.0+
- Fabric API for 1.21.1
- Java 21

## Build
Run `gradle build` from the project root with Gradle 8.8+ and network access so Gradle can resolve Fabric Loom, Minecraft and Fabric API. The output should be `build/libs/BannerExpansion-1.0.0.jar`.

## Install
Put the built JAR and Fabric API in `.minecraft/mods`, then launch Minecraft 1.21.1 with Fabric. Open a Loom: the 15 standard patterns are available without an item. Craft the five special pattern items from paper plus their themed ingredient, then apply them in the Loom.

## Recipes
- Phoenix Charge: Paper + Fire Charge
- Demon Charge: Paper + Ghast Tear
- Wolf Charge: Paper + Bone
- Crown Charge: Paper + Gold Ingot
- Void Charge: Paper + Ender Pearl

## Languages
English (US) and Spanish (Spain).

## Verification status
The source and resources are prepared. This environment did not have Gradle installed and cannot reach external dependency repositories, so a compiled JAR and an in-game test could not be produced here. Do not treat the preview images as in-game screenshots.

## Compilar automáticamente con GitHub

Este proyecto incluye un workflow en `.github/workflows/build.yml`. Para compilarlo sin instalar Java ni Gradle en tu PC:

1. Crea un repositorio en GitHub llamado `BannerExpansion`.
2. Sube **el contenido** de esta carpeta al repositorio (incluida la carpeta oculta `.github`).
3. Abre la pestaña **Actions** del repositorio.
4. Selecciona **Build Banner Expansion** y pulsa **Run workflow** si no se ha iniciado ya automáticamente.
5. Espera a que el trabajo termine en verde.
6. En la página de esa ejecución, baja hasta **Artifacts** y descarga `BannerExpansion-1.0.0`.
7. Extrae el ZIP descargado y copia `BannerExpansion-1.0.0.jar` a `%appdata%\\.minecraft\\mods`.

Necesitas tener instalado Fabric Loader para Minecraft 1.21.1 y Fabric API 1.21.1. Si el trabajo falla, abre el trabajo fallido en Actions y comparte el texto del primer error rojo para poder diagnosticarlo.
