<script lang="ts">
  import { Route, Router } from "svelte-routing";
  import HomePage from "./Page/HomePage.svelte";
</script>

<Router>
  <Route path="/" component={HomePage} />
</Router>
