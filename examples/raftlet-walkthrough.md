# Raftlet Walkthrough

This note is the quickest way to read the extra review model in `raftlet`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | quorum health | 89 | hold |
| stress | lease drift | 237 | ship |
| edge | replica lag | 133 | watch |
| recovery | membership churn | 181 | ship |
| stale | quorum health | 251 | ship |

Start with `stale` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `quorum health` against `quorum health`, not the raw score alone.
