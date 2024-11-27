# Fixes Reborn
A one-mixin-style mod that fixes portability issues in Reborn Core.

## Usage
To use this mod, simply add it to your mods folder along with Tech Reborn or Reborn Core.

## Quilt Usage
If you are using Quilt, follow these steps:

### Step 1
Add `-Dloader.debug.dump_override_paths=true` to your JVM arguments.

### Step 2 (Tech Reborn)
Find where Quilt Loader prints the dependency override for Reborn Core in Tech Reborn. It should look something like this:
```
[main/INFO]: Override path: '<mods>/TechReborn-5.11.13.jar!/META-INF/jars/RebornCore-5.11.13.jar'
```
If you aren't using Tech Reborn, you can skip to Step 2.1.
### Step 2.1
Follow the steps in Step 2.1 if you have both Reborn Core and Tech Reborn in the mods folder.

Find where Quilt Loader prints the dependency override for Reborn Core. It should look something like this:
```
[main/INFO]: Override path: '<mods>/RebornCore-5.11.13.jar'
```

### Step 3
If you have both Reborn Core and Tech Reborn in the mods folder, skip to Step 3.1.

Add the following to `<minecraft folder>/config/quilt-loader-overrides.json`.
Be sure to replace "`<REPLACE THIS 1>`" with the printed dependency override.
```json
{
  "schema_version": 1,
  "overrides": [
    {
      "path": "<REPLACE THIS 1>",
      "depends": [],
      "breaks": [
        {
          "remove": {
            "id": "quilt_loader"
          }
        }
      ]
    }
  ]
}
```

### Step 3.1
If you have both Tech Reborn and Reborn Core in the mods folder, use the following instead.
Be sure to replace "`<REPLACE THIS 1>`" and "`<REPLACE THIS 2>`" with the printed dependency overrides for Reborn Core and Tech Reborn.
```json
{
  "schema_version": 1,
  "overrides": [
    {
      "path": "<REPLACE THIS 1>",
      "depends": [],
      "breaks": [
        {
          "remove": {
            "id": "quilt_loader"
          }
        }
      ]
    },
    {
      "path": "<REPLACE THIS 2>",
      "depends": [],
      "breaks": [
        {
          "remove": {
            "id": "quilt_loader"
          }
        }
      ]
    }
  ]
}
```
