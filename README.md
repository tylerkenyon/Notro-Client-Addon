# NotroPlus (LegacyFabric 1.8.9)

NotroPlus is a LegacyFabric **1.8.9** mod built as a **separate JAR** with an **expandable module system** and a **settings API** (boolean, enum, float slider, int slider, color, etc.).

> Note: This project intentionally keeps any client-specific integration behind an `adapter` interface. If you integrate with any external/closed-source client, make sure you have permission and comply with the target’s license/terms.

---

## Goals

- Refactor the `examplemod` template into:
  - Main class: `dev.technix.notroplus.Main`
  - Mixins package: `dev.technix.notroplus.mixins`
- Provide an intuitive, scalable structure:
  - `core` (bootstrap, lifecycle, logging)
  - `modules` (module definitions, registry, categories, events)
  - `settings` (typed settings + UI-friendly metadata)
  - `api` (public API for third-party modules)
  - `integration` (adapter interfaces + optional implementations)
- Produce a standalone mod JAR that loads via LegacyFabric alongside other mods.

---

## Project Structure

src/main/java/dev/technix/notroplus/
Main.java

api/
NotroPlusApi.java
ModuleProvider.java

core/
NotroPlus.java
Lifecycle.java
Log.java

events/
EventBus.java
events/...

modules/
Module.java
ModuleCategory.java
ModuleRegistry.java
annotations/...
script/
ScriptModule.java
ScriptContext.java

settings/
Setting.java
SettingKey.java
types/
BooleanSetting.java
EnumSetting.java
FloatSetting.java
IntSetting.java
ColorSetting.java
StringSetting.java
KeybindSetting.java
serialization/
SettingCodec.java
JsonSettingStore.java

integration/
ClientAdapter.java
AdapterManager.java
stubs/...

src/main/java/dev/technix/notroplus/mixins/
Mixin...java

src/main/resources/
fabric.mod.json
notroplus.mixins.json


---

## Module & Settings API (high level)

### Modules
A module is a toggleable feature with:
- id, name, description, category
- lifecycle hooks (onEnable/onDisable)
- event hooks (e.g. tick, render, chat)
- typed settings registered up-front

### Settings Types
Supported typed settings:
- Boolean
- Enum (string-labeled options)
- Float slider (min/max/step)
- Int slider (min/max/step)
- Color (ARGB)
- (optional) Keybind, String, MultiEnum, etc.

All settings expose:
- stable key
- display name + description
- default value
- constraints (min/max/step/options)

---
