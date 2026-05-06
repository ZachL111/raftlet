# Field Notes

This note keeps the distributed systems assumptions visible beside the checks.

The domain cases cover `quorum health`, `lease drift`, `replica lag`, and `membership churn`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stale` is the strongest case at 251 on `quorum health`. `baseline` is the cautious anchor at 89 on `quorum health`.

The extra check gives the repository a behavior path that can fail for a domain reason, not only a syntax reason.
