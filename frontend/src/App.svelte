<script lang="ts">
  import { Route, Router } from "svelte-navigator";
  import HomePage from "./Page/HomePage.svelte";
  import SummaPage from "./Page/SummaPage.svelte";
  import { UserCookies } from "./lib/Cookies/User";
  import NoUserPage from "./Page/NoUserPage.svelte";
  import { user } from "./store/user";
    import Error404Page from "./Page/Error404Page.svelte";
</script>

{#if $user}
  <Router>
    <Route path="/" component={HomePage} />
    <Route path="/summa" component={SummaPage} />
    <Route path="/**" component={Error404Page} />
  </Router>
{:else}
  <NoUserPage />
{/if}
