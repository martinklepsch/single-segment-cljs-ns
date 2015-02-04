# Single segment namespace testcase

Compiling Clojurescript namespaces that have only one segment (i.e. no dot)
can sometimes lead to stuff breaking. This is a testcase for that.

```
lein cljsbuild once
open one-seg.html
open two-seg.html
```

See `project.clj` for details.
