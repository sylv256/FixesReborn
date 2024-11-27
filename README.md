# Fixes Reborn
A one-mixin-style mod that fixes portability issues in Reborn Core, making it compatible with more loaders (e.g. Quilt or Connector).

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

## FAQ
### Q: I'm getting an error that says Reborn Core requires Quilt Loader any version!
Follow the steps in [Quilt Usage](#quilt-usage).
### Q: The mod was marked as incompatible with Reborn Core / Tech Reborn.
Please [make a bug report](https://github.com/sylv256/FixesReborn/issues); I will develop a workaround soon.
### Q: I got banned from the Team Reborn Discord / Issue Tracker for using this mod!
I take no responsibility for how you use this mod, but **do not report issues caused by this mod to the Tech Reborn issue tracker, and do not harass Team Reborn developers.**
### Q: Does this mod work with Quilt/Connector/etc.?
Probably. If not, [open an issue](https://github.com/sylv256/FixesReborn/issues).
### Q: Will you backport this mod?
No. Older versions of Tech Reborn / Reborn Core should work just fine. It was only in the more recent updates of Reborn Core that the mod broke. If you believe this is an error, please [open an issue](https://github.com/sylv256/FixesReborn/issues) and explain why.
### Q: This mod crashes with Tech Reborn / Reborn Core.
Ensure that you are using the correct version of Fixes Reborn. If the issue still occurs, please [make a bug report](https://github.com/sylv256/FixesReborn/issues).
